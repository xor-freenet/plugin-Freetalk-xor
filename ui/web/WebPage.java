/* This code is part of Freenet. It is distributed under the GNU General
 * Public License, version 2 (or at your option any later version). See
 * http://www.gnu.org/ for further details of the GPL. */
package plugins.Freetalk.ui.web;

/**
 * Interface specifying what a WebPage should do.
 * 
 * @author Julien Cornuwel (batosai@freenetproject.org)
 */
public interface WebPage {
	
	/**
	 * Actually generates the page's content.
	 */
	public void make();
	
	/**
	 * @return the HTML code of this WebPage.
	 */
	public String toHTML();
	
}
