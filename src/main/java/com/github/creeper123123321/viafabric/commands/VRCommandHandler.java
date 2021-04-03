package com.github.creeper123123321.viafabric.commands;

import com.github.creeper123123321.viafabric.commands.subs.LeakDetectSubCommand;
import us.myles.ViaVersion.commands.ViaCommandHandler;

public class VRCommandHandler extends ViaCommandHandler {
    {
        try {
            registerSubCommand(new LeakDetectSubCommand());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
