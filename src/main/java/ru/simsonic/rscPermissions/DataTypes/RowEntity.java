package ru.simsonic.rscPermissions.DataTypes;
import java.sql.Timestamp;

public class RowEntity extends AbstractRow
{
	public enum EntityType
	{
		group(0),
		player(1),
		unknown(-1);
		public static EntityType byValue(int value)
		{
			for(EntityType constant : EntityType.values())
				if(constant.value == value)
					return constant;
			return unknown;
		}
		private final int value;
		private EntityType(int value)
		{
			this.value = value;
		}
	}
	public String entity;
	public EntityType entity_type;
	public String prefix;
	public String suffix;
	public Timestamp lifetime;
	@Override
	public Table getTable()
	{
		return Table.entities;
	}
}