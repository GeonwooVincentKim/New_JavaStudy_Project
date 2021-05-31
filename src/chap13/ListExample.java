package chap13;

import static java.lang.System.out;

import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        BoardDao dao = new BoardDao();
        out.println(dao);

        List<Board> list = dao.getBoardList();
        out.print(list);

        out.println();
        for (Board board : list) {
            out.println(board.getTitle() + "-" + board.getContent());
        }
    }
}
