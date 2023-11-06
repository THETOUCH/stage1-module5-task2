package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
//        return x -> x.stream().map(i -> i / divider).collect(Collectors.toList());
        return x -> {
            List<Integer> list = new ArrayList<>();
          for (Integer s : x) {
            list.add(s/divider);
          }
          return list;
        };
//        throw new UnsupportedOperationException("You should implement this method.");
    }
}
