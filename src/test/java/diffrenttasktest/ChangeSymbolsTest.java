package diffrenttasktest;

import diffrenttask.ChangeSymbols;
import org.junit.Assert;
import org.junit.Test;

public class ChangeSymbolsTest {

    ChangeSymbols changeSymbols = new ChangeSymbols();

    @Test
    public void refactorStringTest() {
        Assert.assertEquals("Это <тестовый> пример для задачи <на> строки", changeSymbols.replaceSymbols("Это ##тестовый пример## для задачи ##на## строки"));
    }
}
