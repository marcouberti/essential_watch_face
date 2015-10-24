package com.marcouberti.essentialwatchface;

import android.content.Context;

import java.util.HashMap;

public class GradientsUtils {

    static HashMap<String, Integer> map = new HashMap<>();
    static {
        map.put("Aurora",0);
        map.put("Aqua",1);
        map.put("After sunset",2);
        map.put("Fire",3);
        map.put("Forest",4);
        map.put("Love",5);
        map.put("Tropical paradise",6);
        map.put("Mirage",7);
        map.put("Beach",8);
        map.put("Fruit flavour",9);
        map.put("Sun is rising",10);
        map.put("Summer",11);
        map.put("Terra",12);
        map.put("Sunflower",13);
        map.put("Red fruits",14);
        map.put("Country chic",15);
        map.put("Watermelon",16);
        map.put("Gold fish",17);
        map.put("Deep space",18);
        map.put("Cocktail on the beach",19);
        map.put("Passion",20);
        map.put("Black hole",21);
        map.put("Sky",22);
        map.put("Green lawn",23);
        map.put("Grass",24);
        map.put("Flower",25);
        map.put("North pole sky",26);
    }

    public static int[] getGradients(Context ctx, int colorID) {
        if (colorID == 1) {
            return ctx.getResources().getIntArray(R.array.aqua_array);
        } else if (colorID == 5) {
            return ctx.getResources().getIntArray(R.array.love_array);
        } else if (colorID == 2) {
            return ctx.getResources().getIntArray(R.array.after_sunset_array);
        } else if (colorID == 3) {
            return ctx.getResources().getIntArray(R.array.fire_array);
        } else if (colorID == 4) {
            return ctx.getResources().getIntArray(R.array.forest_array);
        } else if (colorID == 6) {
            return ctx.getResources().getIntArray(R.array.tropical_array);
        } else if (colorID == 0) {
            return ctx.getResources().getIntArray(R.array.aurora_array);
        }else if (colorID == 8) {
            return ctx.getResources().getIntArray(R.array.beach_illusion_array);
        }else if (colorID == 9) {
            return ctx.getResources().getIntArray(R.array.fruit_flavour_array);
        }else if (colorID == 10) {
            return ctx.getResources().getIntArray(R.array.sun_rise_array);
        }else if (colorID == 11) {
            return ctx.getResources().getIntArray(R.array.summer_array);
        }else if (colorID == 12) {
            return ctx.getResources().getIntArray(R.array.terra_array);
        }else if (colorID == 13) {
            return ctx.getResources().getIntArray(R.array.sunflower_array);
        }else if (colorID == 14) {
            return ctx.getResources().getIntArray(R.array.wildberries_array);
        }else if (colorID == 15) {
            return ctx.getResources().getIntArray(R.array.country_array);
        }else if (colorID == 16) {
            return ctx.getResources().getIntArray(R.array.watermelon_array);
        }else if (colorID == 17) {
            return ctx.getResources().getIntArray(R.array.goldfish_array);
        }else if (colorID == 18) {
            return ctx.getResources().getIntArray(R.array.deepspace_array);
        }else if (colorID == 19) {
            return ctx.getResources().getIntArray(R.array.bee_array);
        }else if (colorID == 20) {
            return ctx.getResources().getIntArray(R.array.passion_array);
        }else if (colorID == 21) {
            return ctx.getResources().getIntArray(R.array.black_hole_array);
        }else if (colorID == 22) {
            return ctx.getResources().getIntArray(R.array.sky_array);
        }else if (colorID == 23) {
            return ctx.getResources().getIntArray(R.array.green_lawn_array);
        }else if (colorID == 24) {
            return ctx.getResources().getIntArray(R.array.grass_lawn_array);
        }else if (colorID == 25) {
            return ctx.getResources().getIntArray(R.array.flower_lawn_array);
        }else if (colorID == 26) {
            return ctx.getResources().getIntArray(R.array.north_pole_array);
        }
        else {
            return ctx.getResources().getIntArray(R.array.violet_illusion_array);
        }
    }

    public static int[] getGradients(Context ctx, String colorName) {
        if(colorName == null || !map.containsKey(colorName)) return ctx.getResources().getIntArray(R.array.aurora_array);
        return getGradients(ctx, map.get(colorName));
    }

    public static int getColorID(String colorName) {
        return map.get(colorName);
    }
}
