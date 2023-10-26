package org.example;

import lombok.*;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Pair<T1, T2> {
    private T1 key;
    private T2 value;

    @Override
    public String toString() {
        return key + "      " + value + " \n";
    }
}
