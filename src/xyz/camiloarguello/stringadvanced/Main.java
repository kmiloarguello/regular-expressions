package xyz.camiloarguello.stringadvanced;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		// Missisipi splitted by 's'
		// Mi , i , ippi
		
		String missisipi = "Mississippi";
		// Using Regular expressions
		
		Pattern p = Pattern.compile("Mi(.*?)pi");
		Matcher m = p.matcher(missisipi);
		
		
		while(m.find()) {
			System.out.println(m.group(1));
		}
			
		
	}

}

/*
 * 
 * 
<div class="panel-pane pane-views-row newtop100--section1 newtop100--section">
	<div class="container_with_line">
		<article>
			<div class="views-field views-field-field-media"> 
				<div class="field-content">
					<a href="/top-100-djs/poll-2015-dimitri-vegas-mike">
						<div class="media" id="file-7910">
							<figure class="media--image">
								<a href="/top-100-djs/poll-2015-dimitri-vegas-mike">
									<img src="https://djmag.com/sites/default/files/styles/djmag_landscape/public/top100/djs/image/DVLM.png?itok=W2rCuV_y" alt="Dimitri Vegas &amp; Like Mike" title="Dimitri Vegas &amp; Like Mike" />
								</a>
								<figcaption class="media--image--caption">Dimitri Vegas & Like Mike </figcaption>
							</figure>
						</div>
					</a>
				</div>
			</div>
			<div class="views-field views-field-field-top100-position"> 
				<div class="field-content">1</div>
			</div>
			<div class="views-field views-field-field-top100-places"> 
				<div class="field-content">
					<div class="top100dj-title-bar">
						<div class="top100dj-position">1</div>
						<div class="top100dj-name">
							<a href="/top-100-djs/poll-2015-dimitri-vegas-mike">Dimitri Vegas &amp; Like Mike</a>
						</div>
						<div class="top100dj-movement">Up 1</div>
					</div>
				</div>
			</div>
		</article>
	</div>
</div>

*
*/
