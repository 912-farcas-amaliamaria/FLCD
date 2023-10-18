package org.example;

import lombok.*;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Pair {
    private Object element;
    private int code;

    @Override
    public String toString() {
        return "| " +
                 element + " | " + code +
                " |\n";
    }
}
