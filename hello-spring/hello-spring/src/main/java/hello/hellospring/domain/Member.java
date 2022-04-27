package hello.hellospring.domain;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;
import org.springframework.stereotype.Controller;

import javax.persistence.*;

@Entity

public class Member {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //데이터를 구분하기 위해 시스템이 저장하는 아이디

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
