package diffrenttasktest;

import diffrenttask.ChangeSymbols;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChangeSymbolsTest {

    ChangeSymbols changeSymbols = new ChangeSymbols();

    @Test
    public void refactorStringTest() {
        Assertions.assertEquals("Это <тестовый> пример для задачи <на> строки", changeSymbols.replaceSymbols("Это ##тестовый пример## для задачи ##на## строки"));
    }
}
