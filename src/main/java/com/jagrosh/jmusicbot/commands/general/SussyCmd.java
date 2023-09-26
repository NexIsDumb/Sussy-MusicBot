// Class made by @Nex_isDumb, the original project is owned by @jagrosh (John Grosh <john.a.grosh@gmail.com>.)
package com.jagrosh.jmusicbot.commands.general;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import com.jagrosh.jmusicbot.Bot;

/**
 *
 * @author Nex_isDumb
 */
public class SussyCmd extends Command
{
    public SussyCmd(Bot bot)
    {
        this.name = "good boy";
        this.help = "satisfy the bot";
    }

    @Override
    protected void execute(CommandEvent event)
    {
        event.reply("*happy waffle noises*");  // pretty much everything, it was a dumb request yeah💀  - Nex
    }
}