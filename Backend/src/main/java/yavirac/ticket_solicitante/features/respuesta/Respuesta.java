package yavirac.ticket_solicitante.features.respuesta;

import java.sql.Timestamp;
import java.util.Set;
import java.util.HashSet;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("respuesta")
public class Respuesta {
    @Id
    private long id;
    private String comentario;
    private Timestamp created;
    private Timestamp updated;
<<<<<<< HEAD
=======
   
>>>>>>> bcf484082cc9c283147e742b5bdd264fe78548c9
    private boolean enabled;
    private boolean archived;
    @Column("id_ticket")
    private int idTicket;
    private boolean resuelto;

    @MappedCollection(idColumn = "id")
    private Set<RespuestaTicket> tickets = new HashSet<>();


}




