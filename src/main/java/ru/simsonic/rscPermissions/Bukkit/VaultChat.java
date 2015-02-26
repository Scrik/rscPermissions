package ru.simsonic.rscPermissions.Bukkit;
import java.util.Set;
import org.bukkit.OfflinePlayer;
import org.bukkit.World;
import org.bukkit.entity.Player;
import ru.simsonic.rscPermissions.BridgeForBukkitAPI;
import ru.simsonic.rscPermissions.BukkitPluginMain;

public final class VaultChat extends net.milkbowl.vault.chat.Chat
{
	private final BridgeForBukkitAPI bridge;
	private final BukkitPluginMain   rscp;
	private final VaultPermission    permissions;
	public VaultChat(BridgeForBukkitAPI bridge, VaultPermission permissions)
	{
		super(permissions);
		this.bridge = bridge;
		this.rscp = (BukkitPluginMain)bridge.getPlugin();
		this.permissions = permissions;
	}
	@Override
	public String getName()
	{
		return bridge.getName();
	}
	@Override
	public boolean isEnabled()
	{
		return bridge.isEnabled();
	}
	// ***** GET PLAYER PREFIX *****
	@Override
	public String getPlayerPrefix(String world, String player)
	{
		final Player online = bridge.findPlayer(player);
		return online != null ? rscp.permissionManager.getPlayerPrefix(online) : null;
	}
	@Override
	public String getPlayerPrefix(String world, OfflinePlayer player)
	{
		throw new UnsupportedOperationException("This method is unsupported by rscPermissions.");
	}
	@Override
	public String getPlayerPrefix(Player player)
	{
		return rscp.permissionManager.getPlayerPrefix(player);
	}
	// ***** GET PLAYER SUFFIX *****
	@Override
	public String getPlayerSuffix(String world, String player)
	{
		final Player online = bridge.findPlayer(player);
		return online != null ? rscp.permissionManager.getPlayerSuffix(online) : null;
	}
	@Override
	public String getPlayerSuffix(String world, OfflinePlayer player)
	{
		throw new UnsupportedOperationException("This method is unsupported by rscPermissions.");
	}
	@Override
	public String getPlayerSuffix(Player player)
	{
		return rscp.permissionManager.getPlayerSuffix(player);
	}
	// ***** SET PLAYER PREFIX *****
	@Override
	public void setPlayerPrefix(String world, String player, String prefix)
	{
		throw new UnsupportedOperationException("This method is unsupported by rscPermissions.");
	}
	@Override
	public void setPlayerPrefix(String world, OfflinePlayer player, String prefix)
	{
		throw new UnsupportedOperationException("This method is unsupported by rscPermissions.");
	}
	@Override
	public void setPlayerPrefix(Player player, String prefix)
	{
		throw new UnsupportedOperationException("This method is unsupported by rscPermissions.");
	}
	// ***** SET PLAYER SUFFIX *****
	@Override
	public void setPlayerSuffix(String world, String player, String suffix)
	{
		throw new UnsupportedOperationException("This method is unsupported by rscPermissions.");
	}
	@Override
	public void setPlayerSuffix(String world, OfflinePlayer player, String suffix)
	{
		throw new UnsupportedOperationException("This method is unsupported by rscPermissions.");
	}
	@Override
	public void setPlayerSuffix(Player player, String suffix)
	{
		throw new UnsupportedOperationException("This method is unsupported by rscPermissions.");
	}
	// ***** GET GROUP PREFIX *****
	@Override
	public String getGroupPrefix(String world, String group)
	{
		throw new UnsupportedOperationException("This method is unsupported by rscPermissions.");
	}
	@Override
	public String getGroupPrefix(World world, String group)
	{
		throw new UnsupportedOperationException("This method is unsupported by rscPermissions.");
	}
	// ***** GET GROUP SUFFIX *****
	@Override
	public String getGroupSuffix(String world, String group)
	{
		throw new UnsupportedOperationException("This method is unsupported by rscPermissions.");
	}
	@Override
	public String getGroupSuffix(World world, String group)
	{
		throw new UnsupportedOperationException("This method is unsupported by rscPermissions.");
	}
	// ***** SET GROUP PREFIX *****
	@Override
	public void setGroupPrefix(World world, String group, String prefix)
	{
		throw new UnsupportedOperationException("This method is unsupported by rscPermissions.");
	}
	@Override
	public void setGroupPrefix(String world, String group, String prefix)
	{
		throw new UnsupportedOperationException("This method is unsupported by rscPermissions.");
	}
	// ***** SET GROUP SUFFIX *****
	@Override
	public void setGroupSuffix(String world, String group, String suffix)
	{
		throw new UnsupportedOperationException("This method is unsupported by rscPermissions.");
	}
	@Override
	public void setGroupSuffix(World world, String group, String suffix)
	{
		throw new UnsupportedOperationException("This method is unsupported by rscPermissions.");
	}
	// ***********************************************************
	@Override
	public boolean playerInGroup(String world, OfflinePlayer player, String group)
	{
		throw new UnsupportedOperationException("This method is unsupported by rscPermissions.");
	}
	@Override
	public boolean playerInGroup(Player player, String group)
	{
		throw new UnsupportedOperationException("This method is unsupported by rscPermissions.");
	}
	@Override
	public String[] getPlayerGroups(String world, OfflinePlayer player)
	{
		throw new UnsupportedOperationException("This method is unsupported by rscPermissions.");
	}
	@Override
	public String[] getPlayerGroups(Player player)
	{
		final Set<String> result = rscp.permissionManager.getPlayerGroups(player);
		return result.toArray(new String[result.size()]);
	}
	@Override
	public String getPrimaryGroup(String world, OfflinePlayer player)
	{
		throw new UnsupportedOperationException("This method is unsupported by rscPermissions.");
	}
	@Override
	public String getPrimaryGroup(Player player)
	{
		throw new UnsupportedOperationException("This method is unsupported by rscPermissions.");
	}
	@Override
	public String[] getGroups()
	{
		throw new UnsupportedOperationException("This method is unsupported by rscPermissions.");
	}
	// ***** THIS IS TRASH FOR ME :) *****
	@Override
	public int getPlayerInfoInteger(String world, String player, String node, int defaultValue)
	{
		throw new UnsupportedOperationException("This method is unsupported by rscPermissions.");
	}
	@Override
	public void setPlayerInfoInteger(String world, String player, String node, int value)
	{
		throw new UnsupportedOperationException("This method is unsupported by rscPermissions.");
	}
	@Override
	public int getGroupInfoInteger(String world, String group, String node, int defaultValue)
	{
		throw new UnsupportedOperationException("This method is unsupported by rscPermissions.");
	}
	@Override
	public void setGroupInfoInteger(String world, String group, String node, int value)
	{
		throw new UnsupportedOperationException("This method is unsupported by rscPermissions.");
	}
	@Override
	public double getPlayerInfoDouble(String world, String player, String node, double defaultValue)
	{
		throw new UnsupportedOperationException("This method is unsupported by rscPermissions.");
	}
	@Override
	public void setPlayerInfoDouble(String world, String player, String node, double value)
	{
		throw new UnsupportedOperationException("This method is unsupported by rscPermissions.");
	}
	@Override
	public double getGroupInfoDouble(String world, String group, String node, double defaultValue)
	{
		throw new UnsupportedOperationException("This method is unsupported by rscPermissions.");
	}
	@Override
	public void setGroupInfoDouble(String world, String group, String node, double value)
	{
		throw new UnsupportedOperationException("This method is unsupported by rscPermissions.");
	}
	@Override
	public boolean getPlayerInfoBoolean(String world, String player, String node, boolean defaultValue)
	{
		throw new UnsupportedOperationException("This method is unsupported by rscPermissions.");
	}
	@Override
	public void setPlayerInfoBoolean(String world, String player, String node, boolean value)
	{
		throw new UnsupportedOperationException("This method is unsupported by rscPermissions.");
	}
	@Override
	public boolean getGroupInfoBoolean(String world, String group, String node, boolean defaultValue)
	{
		throw new UnsupportedOperationException("This method is unsupported by rscPermissions.");
	}
	@Override
	public void setGroupInfoBoolean(String world, String group, String node, boolean value)
	{
		throw new UnsupportedOperationException("This method is unsupported by rscPermissions.");
	}
	@Override
	public String getPlayerInfoString(String world, String player, String node, String defaultValue)
	{
		throw new UnsupportedOperationException("This method is unsupported by rscPermissions.");
	}
	@Override
	public void setPlayerInfoString(String world, String player, String node, String value)
	{
		throw new UnsupportedOperationException("This method is unsupported by rscPermissions.");
	}
	@Override
	public String getGroupInfoString(String world, String group, String node, String defaultValue)
	{
		throw new UnsupportedOperationException("This method is unsupported by rscPermissions.");
	}
	@Override
	public void setGroupInfoString(String world, String group, String node, String value)
	{
		throw new UnsupportedOperationException("This method is unsupported by rscPermissions.");
	}
	@Override
	public int getPlayerInfoInteger(String world, OfflinePlayer player, String node, int defaultValue)
	{
		throw new UnsupportedOperationException("This method is unsupported by rscPermissions.");
	}
	@Override
	public int getPlayerInfoInteger(Player player, String node, int defaultValue)
	{
		throw new UnsupportedOperationException("This method is unsupported by rscPermissions.");
	}
	@Override
	public void setPlayerInfoInteger(String world, OfflinePlayer player, String node, int value)
	{
		throw new UnsupportedOperationException("This method is unsupported by rscPermissions.");
	}
	@Override
	public void setPlayerInfoInteger(Player player, String node, int value)
	{
		throw new UnsupportedOperationException("This method is unsupported by rscPermissions.");
	}
	@Override
	public int getGroupInfoInteger(World world, String group, String node, int defaultValue)
	{
		throw new UnsupportedOperationException("This method is unsupported by rscPermissions.");
	}
	@Override
	public void setGroupInfoInteger(World world, String group, String node, int value)
	{
		throw new UnsupportedOperationException("This method is unsupported by rscPermissions.");
	}
	@Override
	public double getPlayerInfoDouble(String world, OfflinePlayer player, String node, double defaultValue)
	{
		throw new UnsupportedOperationException("This method is unsupported by rscPermissions.");
	}
	@Override
	public double getPlayerInfoDouble(Player player, String node, double defaultValue)
	{
		throw new UnsupportedOperationException("This method is unsupported by rscPermissions.");
	}
	@Override
	public void setPlayerInfoDouble(String world, OfflinePlayer player, String node, double value)
	{
		throw new UnsupportedOperationException("This method is unsupported by rscPermissions.");
	}
	@Override
	public void setPlayerInfoDouble(Player player, String node, double value)
	{
		throw new UnsupportedOperationException("This method is unsupported by rscPermissions.");
	}
	@Override
	public double getGroupInfoDouble(World world, String group, String node, double defaultValue)
	{
		throw new UnsupportedOperationException("This method is unsupported by rscPermissions.");
	}
	@Override
	public void setGroupInfoDouble(World world, String group, String node, double value)
	{
		throw new UnsupportedOperationException("This method is unsupported by rscPermissions.");
	}
	@Override
	public boolean getPlayerInfoBoolean(String world, OfflinePlayer player, String node, boolean defaultValue)
	{
		throw new UnsupportedOperationException("This method is unsupported by rscPermissions.");
	}
	@Override
	public boolean getPlayerInfoBoolean(Player player, String node, boolean defaultValue)
	{
		throw new UnsupportedOperationException("This method is unsupported by rscPermissions.");
	}
	@Override
	public void setPlayerInfoBoolean(String world, OfflinePlayer player, String node, boolean value)
	{
		throw new UnsupportedOperationException("This method is unsupported by rscPermissions.");
	}
	@Override
	public void setPlayerInfoBoolean(Player player, String node, boolean value)
	{
		throw new UnsupportedOperationException("This method is unsupported by rscPermissions.");
	}
	@Override
	public boolean getGroupInfoBoolean(World world, String group, String node, boolean defaultValue)
	{
		throw new UnsupportedOperationException("This method is unsupported by rscPermissions.");
	}
	@Override
	public void setGroupInfoBoolean(World world, String group, String node, boolean value)
	{
		throw new UnsupportedOperationException("This method is unsupported by rscPermissions.");
	}
	@Override
	public String getPlayerInfoString(String world, OfflinePlayer player, String node, String defaultValue)
	{
		throw new UnsupportedOperationException("This method is unsupported by rscPermissions.");
	}
	@Override
	public String getPlayerInfoString(Player player, String node, String defaultValue)
	{
		throw new UnsupportedOperationException("This method is unsupported by rscPermissions.");
	}
	@Override
	public void setPlayerInfoString(String world, OfflinePlayer player, String node, String value)
	{
		throw new UnsupportedOperationException("This method is unsupported by rscPermissions.");
	}
	@Override
	public void setPlayerInfoString(Player player, String node, String value)
	{
		throw new UnsupportedOperationException("This method is unsupported by rscPermissions.");
	}
	@Override
	public String getGroupInfoString(World world, String group, String node, String defaultValue)
	{
		throw new UnsupportedOperationException("This method is unsupported by rscPermissions.");
	}
	@Override
	public void setGroupInfoString(World world, String group, String node, String value)
	{
		throw new UnsupportedOperationException("This method is unsupported by rscPermissions.");
	}
}
