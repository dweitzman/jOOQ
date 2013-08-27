/*
 * Copyright (c) 2013 by Data Geekery GmbH
 *
 * This program is free software: you can redistribute it and/or modify it 
 * under the terms of the GNU Affero General Public License as published by 
 * the Free Software Foundation, either version 3 of the License, or (at your 
 * option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT 
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS 
 * FOR A PARTICULAR PURPOSE.  See the GNU Affero General Public License for 
 * more details.
 *
 * You should have received a copy of the GNU Affero General Public License 
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.jooq.test.h2.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TUnsigned extends org.jooq.impl.TableImpl<org.jooq.test.h2.generatedclasses.tables.records.TUnsignedRecord> {

	private static final long serialVersionUID = -1307689111;

	/**
	 * The singleton instance of <code>PUBLIC.T_UNSIGNED</code>
	 */
	public static final org.jooq.test.h2.generatedclasses.tables.TUnsigned T_UNSIGNED = new org.jooq.test.h2.generatedclasses.tables.TUnsigned();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.h2.generatedclasses.tables.records.TUnsignedRecord> getRecordType() {
		return org.jooq.test.h2.generatedclasses.tables.records.TUnsignedRecord.class;
	}

	/**
	 * The column <code>PUBLIC.T_UNSIGNED.U_BYTE</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.TUnsignedRecord, org.jooq.types.UByte> U_BYTE = createField("U_BYTE", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, T_UNSIGNED);

	/**
	 * The column <code>PUBLIC.T_UNSIGNED.U_SHORT</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.TUnsignedRecord, org.jooq.types.UShort> U_SHORT = createField("U_SHORT", org.jooq.impl.SQLDataType.SMALLINTUNSIGNED, T_UNSIGNED);

	/**
	 * The column <code>PUBLIC.T_UNSIGNED.U_INT</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.TUnsignedRecord, org.jooq.types.UInteger> U_INT = createField("U_INT", org.jooq.impl.SQLDataType.INTEGERUNSIGNED, T_UNSIGNED);

	/**
	 * The column <code>PUBLIC.T_UNSIGNED.U_LONG</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.TUnsignedRecord, org.jooq.types.ULong> U_LONG = createField("U_LONG", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, T_UNSIGNED);

	/**
	 * No further instances allowed
	 */
	private TUnsigned() {
		super("T_UNSIGNED", org.jooq.test.h2.generatedclasses.Public.PUBLIC);
	}
}
