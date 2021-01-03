/*
 * MIT License
 *
 * Copyright (c) 2018- creeper123123321 <https://creeper123123321.keybase.pub/>
 * Copyright (c) 2019- contributors <https://github.com/ViaVersion/ViaFabric/graphs/contributors>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.github.creeper123123321.viafabric.commands;

import net.minecraft.class_1999;
import net.minecraft.class_2010;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import us.myles.ViaVersion.commands.ViaCommandHandler;

import java.util.Arrays;
import java.util.List;

public class NMSCommandImpl extends class_1999 {
    private ViaCommandHandler handler;

    public NMSCommandImpl(ViaCommandHandler handler) {
        this.handler = handler;
    }

    @Override
    public String method_29277() {
        return "viaversion";
    }

    @Override
    public List<String> method_29274() {
        return Arrays.asList("vvfabric", "viaver");
    }

    @Override
    public String method_29275(class_2010 commandSource) {
        return "/viaversion [help|subcommand]";
    }

    @Override
    public void method_29272(MinecraftServer minecraftServer, class_2010 commandSource, String[] strings) {
        handler.onCommand(new NMSCommandSender(commandSource), strings);
    }

    @Override
    public List<String> method_29273(MinecraftServer minecraftServer, class_2010 commandSource, String[] strings, BlockPos blockPos) {
        return handler.onTabComplete(new NMSCommandSender(commandSource), strings);
    }

    @Override
    public int method_28700() {
        return 3;
    }
}
