package chap13;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

public class BoardDao {
    public List<Board> getBoardList() {
        List<Board> list = new ArrayList<Board>();
        out.print(list);

        list.add(new Board("제목1", "내용1"));
        out.print(list);

        list.add(new Board("제목2", "내용2"));
        out.print(list);

        list.add(new Board("제목3", "내용3"));
        out.print(list);
        return list;
    }
}
