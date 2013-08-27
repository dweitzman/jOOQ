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
public class TExoticTypes extends org.jooq.impl.TableImpl<org.jooq.test.h2.generatedclasses.tables.records.TExoticTypesRecord> {

	private static final long serialVersionUID = 1609568791;

	/**
	 * The singleton instance of <code>PUBLIC.T_EXOTIC_TYPES</code>
	 */
	public static final org.jooq.test.h2.generatedclasses.tables.TExoticTypes T_EXOTIC_TYPES = new org.jooq.test.h2.generatedclasses.tables.TExoticTypes();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.h2.generatedclasses.tables.records.TExoticTypesRecord> getRecordType() {
		return org.jooq.test.h2.generatedclasses.tables.records.TExoticTypesRecord.class;
	}

	/**
	 * The column <code>PUBLIC.T_EXOTIC_TYPES.ID</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.TExoticTypesRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), T_EXOTIC_TYPES);

	/**
	 * The column <code>PUBLIC.T_EXOTIC_TYPES.UU</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.TExoticTypesRecord, java.util.UUID> UU = createField("UU", org.jooq.impl.SQLDataType.UUID, T_EXOTIC_TYPES);

	/**
	 * No further instances allowed
	 */
	private TExoticTypes() {
		super("T_EXOTIC_TYPES", org.jooq.test.h2.generatedclasses.Public.PUBLIC);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.h2.generatedclasses.tables.records.TExoticTypesRecord> getPrimaryKey() {
		return org.jooq.test.h2.generatedclasses.Keys.PK_T_EXOTIC_TYPES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.h2.generatedclasses.tables.records.TExoticTypesRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.h2.generatedclasses.tables.records.TExoticTypesRecord>>asList(org.jooq.test.h2.generatedclasses.Keys.PK_T_EXOTIC_TYPES);
	}
}
