/*
 * Copyright (c) 2013, Francis Galiegue <fgaliegue@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the Lesser GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * Lesser GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.github.fge.jsonschema.messages;

/**
 * Messages used by the configuration process
 */
public enum ConfigurationMessages
{
    NULL_LIBRARY("library cannot be null"),
    DUP_LIBRARY("a library already exists for this URI"),
    NULL_VERSION("version cannot be null"),
    NULL_INSTANCE("instance cannot be null"),
    ;

    private final String message;

    ConfigurationMessages(final String message)
    {
        this.message = message;
    }

    @Override
    public String toString()
    {
        return message;
    }
}
