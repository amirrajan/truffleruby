/*
 * Copyright (c) 2013, 2017 Oracle and/or its affiliates. All rights reserved. This
 * code is released under a tri EPL/GPL/LGPL license. You can use it,
 * redistribute it and/or modify it under the terms of the:
 *
 * Eclipse Public License version 1.0, or
 * GNU General Public License version 2, or
 * GNU Lesser General Public License version 2.1.
 */
package org.truffleruby.stdlib.bigdecimal;

import com.oracle.truffle.api.dsl.Cached;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.object.DynamicObject;
import org.truffleruby.core.cast.IntegerCastNode;
import org.truffleruby.core.cast.ToIntNode;
import org.truffleruby.language.LexicalScope;
import org.truffleruby.language.RubyBaseNode;
import org.truffleruby.language.constants.GetConstantNode;
import org.truffleruby.language.constants.LookupConstantNode;

public abstract class GetIntegerConstantNode extends RubyBaseNode {

    public static GetIntegerConstantNode create() {
        return GetIntegerConstantNodeGen.create();
    }

    public abstract int executeGetIntegerConstant(DynamicObject module, String name);

    @Specialization(guards = "isRubyModule(module)")
    public int doInteger(DynamicObject module, String name,
            @Cached("createLookupConstantNode()") LookupConstantNode lookupConstantNode,
            @Cached("create()") GetConstantNode getConstantNode,
            @Cached("create()") ToIntNode toIntNode,
            @Cached("create()") IntegerCastNode integerCastNode) {
        final Object value = getConstantNode.lookupAndResolveConstant(LexicalScope.IGNORE, module, name, lookupConstantNode);
        return integerCastNode.executeCastInt(toIntNode.executeIntOrLong(value));
    }

    protected LookupConstantNode createLookupConstantNode() {
        return LookupConstantNode.create(false, true, true);
    }

}
