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

@XmlType(name = "EN_objectType")
@XmlEnum
public enum ENObjectType {

    @XmlEnumValue("channel")
    CHANNEL("channel"),
    @XmlEnumValue("configNode")
    CONFIG_NODE("configNode"),
    @XmlEnumValue("contentType")
    CONTENT_TYPE("contentType"),
    @XmlEnumValue("objectType")
    OBJECT_TYPE("objectType"),
    @XmlEnumValue("preferences")
    PREFERENCES("preferences"),
    @XmlEnumValue("programTask")
    PROGRAM_TASK("programTask"),
    @XmlEnumValue("project")
    PROJECT("project"),
    @XmlEnumValue("roles")
    ROLES("roles"),
    @XmlEnumValue("site")
    SITE("site"),
    @XmlEnumValue("staticFile")
    STATIC_FILE("staticFile"),
    @XmlEnumValue("taxonomy")
    TAXONOMY("taxonomy"),
    @XmlEnumValue("workflow")
    WORKFLOW("workflow");
    private final String value;

    ENObjectType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ENObjectType fromValue(String v) {
        for (ENObjectType c: ENObjectType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
