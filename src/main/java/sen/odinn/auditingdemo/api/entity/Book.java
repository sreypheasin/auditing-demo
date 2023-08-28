package sen.odinn.auditingdemo.api.entity;

import jakarta.persistence.*;
import lombok.*;
import sen.odinn.auditingdemo.api.AuditableEntity;

@Entity
@Table(name = "books")
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Book extends AuditableEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String author;
}
