package com.durga.section2;

import java.util.concurrent.*;

/**
 * @author Durganaresh - 10/24/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class Lesson3 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // executor is not provided, CompletableFuture.supplyAsync will use ForkJoinPool by default
        ExecutorService executor = Executors.newCachedThreadPool();


        final String tomatoes = "Tomatoes";
        CompletableFuture<String> sliceTomatoes = CompletableFuture.supplyAsync(() -> {
//			try {
//				TimeUnit.MILLISECONDS.sleep(10);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
            System.out.println("   Restaurant> Slicing tomatoes");
            if (tomatoes == null) {
                throw new RuntimeException("No tomatoes");
            }
            return "Tomatoes ";
        }, executor).handle((result, e) -> {
            if (result == null) {
                System.out.println("Problems with tomatoes");
                return "";
            }
            return result;
        });

        CompletableFuture<String> chopOnions = CompletableFuture.supplyAsync(() -> {
            System.out.println("   Restaurant> Chopping onions");
            return "Onions ";
        }, executor);

        CompletableFuture<String> prepIngredients = sliceTomatoes.thenCombine(chopOnions, //
                String::concat);

        CompletableFuture<Object> prepPizza = prepIngredients.thenApply(toppings -> {
            System.out.println("   Restaurant> Spreading with tomato sauce and sprinkle with toppings: " + toppings);
            return "Raw pizza with " + toppings;
        });

        CompletableFuture<String> bakePizza = prepPizza.thenApply(rawPizza -> {
            System.out.println("   Restaurant> Baking pizza: " + rawPizza);
            try {
                TimeUnit.MILLISECONDS.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Pizza";
        });

        bakePizza.thenAccept(pizza -> System.out.println("Eating pizza: " + pizza));
        // or, the old way  // System.out.println(bakePizza.get());
    }
}
