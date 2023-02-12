package com.example.workbook.ch5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P109_UnmodifiableImmutableCollection {

    private static final List<Integer> LIST = Collections.unmodifiableList(Arrays.asList(1, 2, 3, 4, 5));
    private static final List<Integer> LIST2 = java.util.List.of(1, 2, 3, 4, 5);

    public class MutableMelon{
        private String type;
        private int weight;

        public MutableMelon(String type, int weight) {
            this.type = type;
            this.weight = weight;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }
    }

    private final MutableMelon melon1 = new MutableMelon("Gac", 3000);
    private final MutableMelon melon2 = new MutableMelon("Hemi", 2000);

    private final List<MutableMelon> list = Collections.unmodifiableList(Arrays.asList(melon1, melon2));

    public void playground(){
        melon1.setWeight(0);
        melon2.setWeight(0);
    }

    private final List<MutableMelon> list2 = Collections.unmodifiableList(Arrays.asList(
            new MutableMelon("Gac", 3000),
            new MutableMelon("Hemi", 2000)
    ));

    public void playground2(){
        MutableMelon melon1 = list2.get(0);
        MutableMelon melon2 = list2.get(1);

        melon1.setWeight(0);
        melon2.setWeight(0);
    }

//    private static final List<MutableMelon> list3;
//    static {
//        final MutableMelon melon1 = new MutableMelon("Gac", 3000);
//        final MutableMelon melon2 = new MutableMelon("Hemi", 2000);
//
//        list3 = Collections.unmodifiableList(Arrays.asList(melon1, melon2));
//    }

    private final MutableMelon melon3 = new MutableMelon("Gac", 3000);
    private final MutableMelon melon4 = new MutableMelon("Hemi", 2000);

    private final List<MutableMelon> list3 = List.of(melon3, melon4);

    MutableMelon melon1l = list.get(0);
    MutableMelon melon2l = list.get(1);


    public final class ImmutableMelon{
        private final String type;
        private final int weight;

        public ImmutableMelon(String type, int weight) {
            this.type = type;
            this.weight = weight;
        }
    }


    public static final class ImmutableArray<T> {
        private final T[] array;

        public ImmutableArray(T[] a) {
            array = Arrays.copyOf(a, a.length);
        }

        public static <T> ImmutableArray<T> from(T[] a){
            return new ImmutableArray<>(a);
        }

        public T get(int index){
            return array[index];
        }
    }

    ImmutableArray<String> sample = ImmutableArray.from(new String[] {
            "a", "b", "c"
    });





}
