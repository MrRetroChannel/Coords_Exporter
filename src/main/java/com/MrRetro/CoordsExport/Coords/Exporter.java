package com.MrRetro.CoordsExport.Coords;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent.KeyInputEvent;
import org.lwjgl.input.Keyboard;

public class Exporter {
    public Exporter() {
    }

    @SubscribeEvent
    public void pressed(KeyInputEvent event) {
        if (Keyboard.isKeyDown(Keyboard.KEY_O)) {
            String X = Integer.toString(Minecraft.getMinecraft().player.getPosition().getX());
            String Z = Integer.toString(Minecraft.getMinecraft().player.getPosition().getZ());
            try {
                FileWriter temp = new FileWriter("C:\\Users\\MrRetro\\Desktop\\MyCoords.txt", true);
                BufferedWriter writer = new BufferedWriter(temp);
                writer.append(X + ' ' + Z + ' ' + '\n');
                writer.flush();
                writer.close();
            } catch (IOException mmyeah) {
            }
        }
    }
}

