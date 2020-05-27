/*
 * Copyright (C) 2016-2020 the original author or authors. 
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.viglet.shio.wem.v085.importexport;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "EN_channelType")
@XmlEnum
public enum ENChannelType {

    @XmlEnumValue("home")
    HOME("home"),
    @XmlEnumValue("unassignedContent")
    UNASSIGNED_CONTENT("unassignedContent"),
    @XmlEnumValue("archivedContent")
    ARCHIVED_CONTENT("archivedContent"),
    @XmlEnumValue("applicationAssets")
    APPLICATION_ASSETS("applicationAssets"),
    @XmlEnumValue("subChannel")
    SUB_CHANNEL("subChannel");
    private final String value;

    ENChannelType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ENChannelType fromValue(String v) {
        for (ENChannelType c: ENChannelType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
