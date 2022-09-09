package tamil;
import lombok.NoArgsConstructor;

import lombok.AllArgsConstructor;
import lombok.Data;
import javax.persistence.*;
@Entity
@Table(name="socialMediaDhivya_user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TamilDao{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "location")
    private String location;
    @Column(name = "age")
    private int age;
    @Column(name = "country")
    private String country;


    public TamilDao() {
    }
}
