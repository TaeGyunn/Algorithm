package Programmers.Level2;

import java.util.LinkedList;

public class 캐시 {

    static final int CACHE_HIT = 1;
    static final int CACHE_MISS = 5;

    public int solution(int cacheSize, String[] cities){
        if(cacheSize == 0){
            return cities.length * 5;
        }
        int answer  = 0;

        LinkedList<String> cache = new LinkedList<>();

        for(int i=0; i<cities.length; i++){
            String city = cities[i].toUpperCase();

            // cache hit
            if(cache.remove(city)){
                cache.addFirst(city);
                answer += CACHE_HIT;
            }else{
                // cache miss
                int currentSize = cache.size();

                if(currentSize == cacheSize){
                    cache.pollLast();
                }
                cache.addFirst(city);
                answer += CACHE_MISS;
            }

        }
        return answer;
    }

    public static void main(String[] args){

        int cashSize;
        String[] cities;
    }
}
