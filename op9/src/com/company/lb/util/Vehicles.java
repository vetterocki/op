package com.company.lb.util;

import com.company.lb.model.Vehicle;

import java.util.*;

public class Vehicles<T extends Vehicle> {
    @SafeVarargs
    public static <T> SortedSet<T> getVehiclesSortedSet(Comparator<T> comparator, T... t) {
        SortedSet<T> set = new TreeSet<>(comparator);
        set.addAll(Arrays.asList(t));
        return set;
    }
}
