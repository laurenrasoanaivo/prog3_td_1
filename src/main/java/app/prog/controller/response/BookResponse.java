package app.prog.controller.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Data;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class BookResponse {
    private int id;
    private String author;
    private String title;
    private boolean hasAuthor;
}
