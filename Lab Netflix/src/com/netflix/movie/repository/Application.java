package com.netflix.movie.repository;

import com.netflix.movie.controller.NetflixController;
import com.netflix.movie.model.Netflix;
import com.netflix.movie.repository.NetflixRepository;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Application {


    public static void main(String[] args) {
        NetflixRepository netflixRepository = new NetflixRepository();
        NetflixController netflixController = new NetflixController();
        netflixRepository.getData();

        System.out.println("==============================================");

        Scanner sc = new Scanner(System.in);
        List<Netflix> netflixList = netflixRepository.netflixList;//DS cac doi tuong gan cho netfLixList

        while (true) {
            menu();
            int ch = sc.nextInt();
            sc.nextLine();
            switch (ch) {
                case 1://Sắp xếp theo tên, sử dụng hàm sort() của Collection(s)
                    System.out.println("Phim sau khi săp xếp");
                    Collections.sort(netflixList, new Comparator<Netflix>() {
                        @Override
                        public int compare(Netflix o1, Netflix o2) {
                            return o1.getTitle().compareTo(o2.getTitle());
                        }
                    });
                    printResult(netflixList);
                    break;
                case 2:
                    System.out.println("Tìm kiếm theo title phim");
                    String name = sc.nextLine();
                    netflixController.searchMovieByName(netflixList, name);
                    break;
                case 3:
                    System.out.println("Ten category can tim la: ");
                    String category = sc.nextLine();
                    netflixController.searchMovieByCategory(netflixList, category);
                    break;
                case 4:
                    System.out.println("Ten language can tim la: ");
                    String language = sc.nextLine();
                    netflixController.searchMovieByLanguage(netflixList, language);
                    break;
                case 5:
                    netflixController.countMovieByCategory();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    break;
            }

        }

    }

    public static void menu() {
        System.out.println("Chức năng: ");
        System.out.println("1. Sắp xếp theo title phim");
        System.out.println("2. Tìm kiếm theo title");
        System.out.println("3. Tìm kiếm theo category");
        System.out.println("4. Tìm kiếm theo language");
        System.out.println("5. Thống kê phim theo category");
        System.out.println("6. Kết thúc chương trình");
    }

    public static void printResult(List<Netflix> list) {
        for (Netflix netflix : list) {
            System.out.println(netflix);
        }
    }
}

