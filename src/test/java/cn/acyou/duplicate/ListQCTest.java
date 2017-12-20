package cn.acyou.duplicate;

import java.util.*;

/**
 * @author youfang
 * @date 2017-12-20 11:47
 **/
public class ListQCTest {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<User>();
        User user1 = new User("张三", "001");
        userList.add(user1);
        User user2 = new User("李四", "001");
        userList.add(user2);
        User user3 = new User("王五", "004");
        userList.add(user3);

        List<User> userList2 = new ArrayList<User>();
        User user12 = new User("王五", "001");
        userList2.add(user12);
        User user22 = new User("张飞", "001");
        userList2.add(user22);
        User user32 = new User("刘备", "002");
        userList2.add(user32);
        User user322 = new User("张三", null);
        userList2.add(user322);

//方法1 双重for循环比较，想怎么操作怎么操作
        for (int i =0;i<userList.size();i++){
            for (int j=0;j<userList2.size();j++){
                if (userList.get(i).getName().equals(userList2.get(j).getName())){
                    userList2.remove(j);
                }
            }
        }
        List<User> users = new ArrayList<>(userList);
        users.addAll(userList2);
        for (User u :users){
            System.out.println(u);
        }

//方法2 通过Set集合，依赖对象的equals方法去重
        Set<User> set = new HashSet<User>(userList);
        set.addAll(userList2);

        for (User u :set){
            System.out.println(u);
        }
//方法3  通过Map的key不能重复，其中：LinkedHashMap可以记录添加的顺序，HashMap不会记录添加顺序
        Map<String,User> map = new LinkedHashMap<String, User>();
        for (User u1 : userList){
            map.put(u1.getName(),u1);
        }
        for (User u2 : userList2){
            if (map.containsKey(u2.getName())){
                continue;
            }
            map.put(u2.getName(),u2);
        }
        List<User> uu = new ArrayList<User>(map.values());
        for (User u : uu){
            System.out.println(u);
        }

//方法4 利用treeSet的自定义比较，不需要对象重写equals方法
        Set<User> sets = new TreeSet<User>(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        sets.addAll(userList);
        sets.addAll(userList2);
        for (User u : sets){
            System.out.println(u);
        }

/*        userList.add(user3);
        for (User u : userList) {
            System.out.println(u.getName());
        }
        System.out.println("去重后=======>");
        List<User> userListNoDupAndSort = removeDuplicateUser(userList);
        for (User u : userListNoDupAndSort) {
            System.out.println(u.getName());
        }*/
    }

    private static ArrayList<User> removeDuplicateUser2(List<User> users) {
        Set<User> set = new TreeSet<User>(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        set.addAll(users);
        return new ArrayList<User>(set);
    }

    class People{
        private Integer id;
        private String age;
    }
}

class User {
    private String name;
    private String userId;

    public User(String name, String userId) {
        this.name = name;
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return name.equals(user.name);

    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }
}
