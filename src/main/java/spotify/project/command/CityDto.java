package spotify.project.command;

import lombok.Builder;
import lombok.Data;
import spotify.project.models.Category;
import spotify.project.models.City;

import java.io.Serializable;
import java.util.List;

/**
 * A DTO for the {@link City} entity
 */
@Data
public class CityDto{

	private String name;
	private List<CategoryDto> categories;
	private String summary;
}