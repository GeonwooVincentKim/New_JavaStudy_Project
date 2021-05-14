package chap08_1;

public class MySQLDao implements DataAccessObject {
    @Override
    public void select(){
        System.out.println("MySQL 에서 검색");
    }

    @Override
    public void insert(){
        System.out.println("MySQL 에서 삽입");
    }

    @Override
    public void update(){
        System.out.println("MySQL 에서 수정");
    }

    @Override
    public void delete(){
        System.out.println("MySQL 에서 삭제");
    }
}
