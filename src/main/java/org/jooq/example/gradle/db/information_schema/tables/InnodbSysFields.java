/**
 * This class is generated by jOOQ
 */
package org.jooq.example.gradle.db.information_schema.tables;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.example.gradle.db.information_schema.InformationSchema;
import org.jooq.example.gradle.db.information_schema.tables.records.InnodbSysFieldsRecord;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.4"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InnodbSysFields extends TableImpl<InnodbSysFieldsRecord> {

	private static final long serialVersionUID = 1811825203;

	/**
	 * The reference instance of <code>information_schema.INNODB_SYS_FIELDS</code>
	 */
	public static final InnodbSysFields INNODB_SYS_FIELDS = new InnodbSysFields();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<InnodbSysFieldsRecord> getRecordType() {
		return InnodbSysFieldsRecord.class;
	}

	/**
	 * The column <code>information_schema.INNODB_SYS_FIELDS.INDEX_ID</code>.
	 */
	public final TableField<InnodbSysFieldsRecord, ULong> INDEX_ID = createField("INDEX_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_SYS_FIELDS.NAME</code>.
	 */
	public final TableField<InnodbSysFieldsRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR.length(193).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.INNODB_SYS_FIELDS.POS</code>.
	 */
	public final TableField<InnodbSysFieldsRecord, UInteger> POS = createField("POS", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>information_schema.INNODB_SYS_FIELDS</code> table reference
	 */
	public InnodbSysFields() {
		this("INNODB_SYS_FIELDS", null);
	}

	/**
	 * Create an aliased <code>information_schema.INNODB_SYS_FIELDS</code> table reference
	 */
	public InnodbSysFields(String alias) {
		this(alias, INNODB_SYS_FIELDS);
	}

	private InnodbSysFields(String alias, Table<InnodbSysFieldsRecord> aliased) {
		this(alias, aliased, null);
	}

	private InnodbSysFields(String alias, Table<InnodbSysFieldsRecord> aliased, Field<?>[] parameters) {
		super(alias, InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbSysFields as(String alias) {
		return new InnodbSysFields(alias, this);
	}

	/**
	 * Rename this table
	 */
	public InnodbSysFields rename(String name) {
		return new InnodbSysFields(name, null);
	}
}