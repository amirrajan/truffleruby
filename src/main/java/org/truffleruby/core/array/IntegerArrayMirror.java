/*
 * Copyright (c) 2015, 2017 Oracle and/or its affiliates. All rights reserved. This
 * code is released under a tri EPL/GPL/LGPL license. You can use it,
 * redistribute it and/or modify it under the terms of the:
 *
 * Eclipse Public License version 1.0, or
 * GNU General Public License version 2, or
 * GNU Lesser General Public License version 2.1.
 */
package org.truffleruby.core.array;

import java.util.Arrays;

import com.oracle.truffle.api.CompilerDirectives.TruffleBoundary;

class IntegerArrayMirror extends BasicArrayMirror {

    private final int[] array;

    public IntegerArrayMirror(int[] array) {
        this.array = array;
    }

    @Override
    public int getLength() {
        return array.length;
    }

    @Override
    public Object get(int index) {
        return array[index];
    }

    @Override
    public void set(int index, Object value) {
        array[index] = (int) value;
    }

    @Override
    public ArrayMirror newMirror(int newLength) {
        return new IntegerArrayMirror(new int[newLength]);
    }

    @Override
    public ArrayMirror copyArrayAndMirror() {
        return new IntegerArrayMirror(array.clone());
    }

    @Override
    public ArrayMirror copyArrayAndMirror(int newLength) {
        return new IntegerArrayMirror(ArrayUtils.grow(array, newLength));
    }

    @Override
    public void copyTo(ArrayMirror destination, int sourceStart, int destinationStart, int count) {
        if (destination instanceof IntegerArrayMirror) {
            System.arraycopy(array, sourceStart, destination.getArray(), destinationStart, count);
        } else if (destination instanceof LongArrayMirror) {
            for (int i = 0; i < count; i++) {
                destination.set(destinationStart + i, (long) array[sourceStart + i]);
            }
        } else {
            for (int i = 0; i < count; i++) {
                destination.set(destinationStart + i, array[sourceStart + i]);
            }
        }
    }

    @Override
    public void copyTo(Object[] destination, int sourceStart, int destinationStart, int count) {
        for (int n = 0; n < count; n++) {
            destination[destinationStart + n] = array[sourceStart + n];
        }
    }

    @TruffleBoundary
    public void sort(int size) {
        Arrays.sort(array, 0, size);
    }

    @Override
    public Object getArray() {
        return array;
    }

}
