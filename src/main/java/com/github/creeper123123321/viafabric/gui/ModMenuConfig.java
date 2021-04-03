package com.github.creeper123123321.viafabric.gui;

import io.github.prospector.modmenu.api.ModMenuApi;
import net.minecraft.client.gui.screen.Screen;

import java.util.function.Function;

public class ModMenuConfig implements ModMenuApi {
    @Override
    public String getModId() {
        return "viafabric";
    }

    @Override
    public Function<Screen, ? extends Screen> getConfigScreenFactory() {
        return ViaConfigScreen::new;
    }
}