import model.ComparatorStudent;
import model.ComparatorStudentSortByName;
import model.Student;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Stack  - là 1 class kế thừa List
//        Stack<String> stack = new Stack<>();
//        // thêm mới 1 phần tử vào stack
//        stack.push("Hùng");
//        stack.push("Nam");
//        stack.push("Đức");
//        stack.push("Ngọc Anh");
        // lấy ra phần tử
//        System.out.println("Phần tử lấy ra đầu tiên : "+stack.pop());
//        System.out.println("Phần tử lấy ra thứ 2 : "+stack.pop());
//        System.out.println("Phần tử lấy ra thứ 3 : "+stack.pop());
//        System.out.println("Phần tử lấy ra cuối cùng : "+stack.pop());
//        System.out.println(stack);
        // lấy phần tử trên cùng của stack
//        System.out.println("Phân tử trên cùng của stack là :" + stack.peek());
//        System.out.println("Lấy và xoa phần tử trên cùng của stack là :"+stack.pop());
//        System.out.println("Lấy và xoa phần tử trên cùng của stack là :"+stack.pop());
//        System.out.println("Lấy và xoa phần tử trên cùng của stack là :"+stack.pop());
//        System.out.println("Lấy và xoa phần tử trên cùng của stack là :"+stack.pop());
//        System.out.println(stack.empty());
//        System.out.println(stack);
//
//        while (!stack.empty()) {
//            System.out.println("Lấy và xoa phần tử trên cùng của stack là :" + stack.pop());
//        }

        // Queue là inteface
//        Queue<Integer> queue = new ArrayDeque<>();
//         thêm phần tử vào
//        queue.offer(1);
//        queue.offer(2);
//        queue.offer(3);
//        queue.offer(4);
//        //  lấy và xóa phần từ đầu và ném ra ngoại lệ (lỗi) nếu rỗng
//        System.out.println(queue);
//        if (!queue.isEmpty()) {
//            System.out.println(queue.remove());
//        }
//        System.out.println(queue);

        // poll là lấy và xóa phần tử ở đầu và trả về null nếu rỗng
//        System.out.println("Phần tử lấy ra đầu tiên là :" + queue.poll());
//        System.out.println("Phần tử lấy ra tiếp theo là :" + queue.poll());
//        System.out.println("Phần tử lấy ra tiếp theo là :" + queue.poll());
//        System.out.println("Phần tử lấy ra tiếp theo là :" + queue.poll());

        //  peek là chỉ lấy ra phần tử đầu nhưng ko xóa và trả về null nếu rỗng
//        System.out.println("Lấy phần tử đàu tiên"+queue.peek());
        // element là chỉ lấy phần tử đầu tiên nhưng không xóa và ném ra ngoại lệ (lỗi)
        // nếu không có phần tử nào
//        System.out.println("Phần tử đầu tiên là"+ queue.element());


        // tạo mảng sinh viên 5 phần tử
        Student s1 = new Student("SV001","Nguyễn Tuấn Anh",19,"Hà Nội");
        Student s2 = new Student("SV009","Đỗ Đức Mạnh",20,"Thanh Hóa");
        Student s3 = new Student("SV005","Đào Hoàng Hải",18,"Kiên Giang");
        Student s4 = new Student("SV004","Vương Lan",22,"Nghệ An");
        Student s5 = new Student("SV008","Nguyễn Minh Đức",21,"Cần Thơ");
        s1.setDtb(8.500000001);
        s2.setDtb(8.5000001);
        s3.setDtb(8.50000001);
        s4.setDtb(9.5);
        s5.setDtb(6.5);


        Student[] students = {s1,s2,s3,s4,s5};
        for (Student s:students
             ) {
            System.out.println(s);
        }

        //  sắp xếp theo tuổi giảm dần
        // cách 1 : sử dụng Comparable;
//        Arrays.sort(students);
//        // cách 2 : tạo đối tượng Comparator
//        ComparatorStudent comparator = new ComparatorStudent();
//        ComparatorStudentSortByName comparatorStudentSortByName = new ComparatorStudentSortByName();
//        Arrays.sort(students,comparator);
//        Arrays.sort(students,comparator.reversed());
//        Arrays.sort(students,comparatorStudentSortByName.reversed());
        // sử dụng lớp nặc danh để khởi tạo đối tượng comparator
//        Comparator<Student> com =  new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getAddress().compareTo(o2.getAddress());
//            }
//        }; // quá dài
        // khới tạo đối tượng functional interface -
        // là 1 interface chỉ có duy nhất 1 phương thức trừu tượng

        // sử dụng cú phap lamda - cú pháp arrow function trong js
        // (params)->{statements}
//        Comparator<Student> comLamda = (o1,o2)->o2.getAge()-o1.getAge(); // chưa phải cách ngắn nhất
//
//        Arrays.sort(students,comLamda);
//
//        Arrays.sort(students,(o1,o2)->o1.getAge()-o2.getAge());
//        System.out.println("mảng sau khi đã sắp xếp");
//        for (Student s:students
//        ) {
//            System.out.println(s);
//        }
//        //  sắp xếp theo điểm tb tăng dần ;
//        Arrays.sort(students,new ComparatorStudent());
//        System.out.println("Sắp xếp theo dtb");
//        for (Student s:students
//        ) {
//            System.out.println(s);
//        }
//

        // collection
//        List<Student> studentList = Arrays.asList(s1,s2,s3,s4,s5);
//        Collections.sort(studentList);
////        Collections.sort(studentList, (o1,o2)->Double.compare(o1.getDtb(),o2.getDtb()));
//        studentList.sort((o1,o2)->Double.compare(o1.getDtb(),o2.getDtb()));
//        for (Student s:studentList
//             ) {
//            System.out.println(s);
//        }


        // Tree-Map
        // Hash Map
        Map<Student,Integer> map = new HashMap<>();
//        Map<Student,Integer> map = new LinkedHashMap<>();
//        Map<Student,Integer> map = new TreeMap<>((o1,o2)->o1.getAge()-o2.getAge());
        // thêm mới
        map.put(s1,10);
        map.put(s2,15);
        map.put(s3,9);
        map.put(s2,14); // nếu trung key thì dùng để  cập nhật value
        System.out.println("Danh sách map");
        System.out.println(map);
        System.out.println("----------------------------");
        // xóa theo key
        map.remove(s2);
        System.out.println(map);
        // kiểm tra tồn tại theo key
        System.out.println(map.containsKey(s1)); // true
        // kiểm tra tồn tại theo value
        System.out.println(map.containsValue(9)); // true
        // trả về 1 Set<Entry>
        for (Map.Entry<Student,Integer> en : map.entrySet()
             ) {
            System.out.println("Key "+ en.getKey());
            System.out.println("Value "+ en.getValue());
        }

//        for (TypeOfElement e : collection){
//           // logic xử lí
//        }

        // duyệt theo key
        for (Student s:map.keySet()
             ) {
            System.out.println("Key"+s);
            // lấy ra giá trị thông qua key
            System.out.println("Value "+map.get(s));
        }
        // duyệt theo giá trị  - íts dùng
        for (Integer value : map.values()){
            System.out.println("Value "+value);
        }
    }

}