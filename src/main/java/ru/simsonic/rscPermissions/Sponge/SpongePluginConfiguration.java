package ru.simsonic.rscPermissions.Sponge;

import java.util.Map;
import ru.simsonic.rscPermissions.API.Settings;
import ru.simsonic.rscPermissions.API.TranslationProvider;
import ru.simsonic.rscPermissions.SpongePluginMain;
import ru.simsonic.rscUtilityLibrary.ConnectionMySQL.ConnectionParams;

public class SpongePluginConfiguration implements Settings
{
	private final SpongePluginMain rscp;
	public SpongePluginConfiguration(SpongePluginMain plugin)
	{
		this.rscp = plugin;
	}
	@Override
	public void onLoad()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}
	@Override
	public void readSettings()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}
	@Override
	public String getDefaultGroup()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}
	@Override
	public boolean isDefaultForever()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}
	@Override
	public boolean isAsteriskOP()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}
	@Override
	public boolean isInMaintenance()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}
	@Override
	public String getMaintenanceMode()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}
	@Override
	public void setMaintenanceMode(String mode)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}
	@Override
	public boolean isUseResidence()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}
	@Override
	public boolean isUseWorldGuard()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}
	@Override
	public long getRegionFinderGranularity()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}
	@Override
	public int getAutoReloadDelayTicks()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}
	@Override
	public boolean isUseMetrics()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}
	@Override
	public Map<String, Integer> getSlotLimits()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}
	@Override
	public TranslationProvider getTranslationProvider()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}
	@Override
	public ConnectionParams getConnectionParams()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}
}
