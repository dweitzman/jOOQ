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
package org.jooq.test.h2.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class XTestCase_2025 implements org.jooq.test.h2.generatedclasses.tables.interfaces.IXTestCase_2025 {

	private static final long serialVersionUID = 961952852;

	private java.lang.Integer refId;
	private java.lang.String  refName;

	@Override
	public java.lang.Integer getRefId() {
		return this.refId;
	}

	@Override
	public void setRefId(java.lang.Integer refId) {
		this.refId = refId;
	}

	@Override
	public java.lang.String getRefName() {
		return this.refName;
	}

	@Override
	public void setRefName(java.lang.String refName) {
		this.refName = refName;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.h2.generatedclasses.tables.interfaces.IXTestCase_2025 from) {
		setRefId(from.getRefId());
		setRefName(from.getRefName());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.h2.generatedclasses.tables.interfaces.IXTestCase_2025> E into(E into) {
		into.from(this);
		return into;
	}
}
