package com.github.creeper123123321.viafabric.commands;

import com.github.creeper123123321.viafabric.commands.subs.LeakDetectSubCommand;
import com.viaversion.viaversion.commands.ViaCommandHandler;

public class VRCommandHandler extends ViaCommandHandler {
    {
        try {
            registerSubCommand(new LeakDetectSubCommand());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
