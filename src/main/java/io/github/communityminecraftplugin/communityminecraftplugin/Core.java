package io.github.communityminecraftplugin.communityminecraftplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class Core extends JavaPlugin {
	
	public static final String HELLO_WORLD = "Hello, world!";
	
	@Override
	public void onEnable(){
		
		getLogger().info(HELLO_WORLD);
		getCommand("helloworld").setExecutor(new HelloWorldCommand());
		getServer().getPluginManager().registerEvents(new HelloWorldChatListener(), this);
		
	}
	
	@Override
	public void onDisable(){
		
		getLogger().info(HELLO_WORLD.replace("Hello,", "Goodbye,"));
		
	}
	
	
}
