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

package com.github.fge.jsonschema.keyword.validator.draftv4;

import com.fasterxml.jackson.databind.JsonNode;
import com.github.fge.jsonschema.exceptions.ProcessingException;
import com.github.fge.jsonschema.keyword.validator.helpers.PositiveIntegerValidator;
import com.github.fge.jsonschema.processing.Processor;
import com.github.fge.jsonschema.processors.data.FullData;
import com.github.fge.jsonschema.report.ProcessingReport;

import static com.github.fge.jsonschema.messages.KeywordValidationMessages.*;

/**
 * Keyword validator for draft v4's {@code maxProperties}
 */
public final class MaxPropertiesValidator
    extends PositiveIntegerValidator
{
    public MaxPropertiesValidator(final JsonNode digest)
    {
        super("maxProperties", digest);
    }

    @Override
    public void validate(final Processor<FullData, FullData> processor,
        final ProcessingReport report, final FullData data)
        throws ProcessingException
    {
        final int size = data.getInstance().getNode().size();
        if (size > intValue)
            report.error(newMsg(data).message(TOO_MANY_MEMBERS_IN_OBJECT)
                .put("required", intValue).put("found", size));
    }
}
