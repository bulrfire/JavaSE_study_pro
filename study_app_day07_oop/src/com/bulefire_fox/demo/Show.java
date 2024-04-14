package com.bulefire_fox.demo;

public class Show {
    private Movie[] movies;
    public Show(Movie[] movies){
        this.movies = movies;
    }

    //展示全部信息
    public void printAllMovies(){
        System.out.println("----全部信息----" + '\n');
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            System.out.println("编号：" + m.getId());
            System.out.println("名字：" + m.getName());
            System.out.println("价格：" + m.getPrice());
            System.out.println('\n' + "------------------" + '\n');
        }
    }

    //根据id展示详细展示
    public void searchMovieByID(int id){
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            if (m.getId() == id){
                System.out.println("----该电影详情如下----");
                System.out.println("编号：" + m.getId());
                System.out.println("名字：" + m.getName());
                System.out.println("价格：" + m.getPrice());
                System.out.println("评分：" + m.getScore());
                System.out.println("导演：" + m.getMaker());
                System.out.println("主演：" + m.getMainPeople());
                System.out.println("其他信息" + m.getInfo() + '\n');
                return;
            }
        }
        System.out.println("没有该电影信息");
    }
}
