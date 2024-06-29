package dev.sdachess.spotifywatcher;

import dev.sdachess.spotifywatcher.validation.CurrentSongInfo;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/song")
public class SongResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public CurrentSongInfo currentSong() {
        return new CurrentSongInfo(
                "The Less I Know The Better",
                "Tame Impala",
                "Currents",
                "https://i.scdn.co/image/ab67616d0000b273f4f4f4f4f4f4f4f4f4f4f4f4",
                true,
                120
        );
    }
}
