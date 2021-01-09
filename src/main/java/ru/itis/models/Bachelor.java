package ru.itis.models;

import com.querydsl.core.annotations.QueryEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@QueryEntity
@Document(collection = "bachelor")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Bachelor {
    @Id
    private String _id;
    private String college;
    private String name;
    private String surname;
}
