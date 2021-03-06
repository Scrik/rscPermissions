package ru.simsonic.rscPermissions.API;

import java.util.Map;
import ru.simsonic.rscUtilityLibrary.ConnectionMySQL.ConnectionParams;

public interface Settings
{
	public static final String chatPrefix      = "{GOLD}[rscp] {_LS}";
	public static final String separator       = ".";
	public static final String separatorRegExp = "\\.";
	public static final String instantiator    = "?";
	public static final String textInheriter   = "%";
	public static final char   groupLevelTab   = '┏';
	public static final boolean decolorizeForConsole = false;
	public void    onLoad();
	public void    readSettings();
	public String  getDefaultGroup();
	public boolean isDefaultForever();
	public boolean isAsteriskOP();
	public boolean isInMaintenance();
	public String  getMaintenanceMode();
	public void    setMaintenanceMode(String mode);
	public boolean isUseResidence();
	public boolean isUseWorldGuard();
	public long    getRegionFinderGranularity();
	public int     getAutoReloadDelayTicks();
	public boolean isUseMetrics();
	public Map<String, Integer> getSlotLimits();
	public TranslationProvider  getTranslationProvider();
	public ConnectionParams     getConnectionParams();
}
