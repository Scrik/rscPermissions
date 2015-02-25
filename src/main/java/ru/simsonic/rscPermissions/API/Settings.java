package ru.simsonic.rscPermissions.API;
import ru.simsonic.rscUtilityLibrary.ConnectionMySQL.ConnectionParams;

public interface Settings
{
	public static final String chatPrefix = "{YELLOW}[rscp] {GOLD}";
	public static final String separator       = ".";
	public static final String separatorRegExp = "\\.";
	public static final String instantiator    = "?";
	public static final String textInheriter   = "%";
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
	public TranslationProvider getTranslationProvider();
	public ConnectionParams    getConnectionParams();
}
