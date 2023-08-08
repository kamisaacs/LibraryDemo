
package org.wecancodeit.library;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;
import org.wecancodeit.library.Controllers.CampusController;
import org.wecancodeit.library.Models.Campus;
import org.wecancodeit.library.Repositories.CampusRepository;

public class CampusControllerTest {

    @InjectMocks
    private CampusController underTest;

    @Mock
    private CampusRepository campusRepository;

    @Mock
    private Campus campus1;

    @Mock
    private Campus campus2;

    @Mock
    private Model model;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void shouldReturnAllCampuses() {
        Collection<Campus> allCampuses = Arrays.asList(campus1, campus2);
        when(campusRepository.findAll()).thenReturn(allCampuses);
        underTest.displayCampuses(model);
        verify(model).addAttribute("campuses", allCampuses);
    }

    @Test
    public void shouldAddNewCampus() {
        underTest.addCampus("John's Town");
        verify(campusRepository).save(new Campus("John's Town"));
    }

    @Test
    public void shouldAddCampusAndRedirect() {
        String results = underTest.addCampus("John's Town");
        assertEquals("redirect:campuses", results);
    }

}
