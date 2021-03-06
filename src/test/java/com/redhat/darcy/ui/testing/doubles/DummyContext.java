/*
 Copyright 2014 Red Hat, Inc. and/or its affiliates.

 This file is part of darcy.

 This program is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.redhat.darcy.ui.testing.doubles;

import com.redhat.darcy.ui.api.ElementContext;
import com.redhat.darcy.ui.api.elements.Label;
import com.redhat.darcy.ui.internal.FindsById;

import java.util.ArrayList;
import java.util.List;

/**
 * A test context that can only find Label elements, and always returns
 * {@link AlwaysDisplayedLabel} as the implementation.
 */
public class DummyContext implements ElementContext, FindsById {
    @SuppressWarnings("unchecked")
    @Override
    public <T> List<T> findAllById(Class<T> type, String id) {
        if (!type.isAssignableFrom(Label.class)) {
            throw new RuntimeException("This DummyContext can only find Label element types.");
        }
        
        List<Label> found = new ArrayList<>(1);
        found.add(new AlwaysDisplayedLabel());
        
        return (List<T>) found;
    }

    @Override
    public <T> T findById(Class<T> type, String id) {
        return findAllById(type, id).get(0);
    }

}
