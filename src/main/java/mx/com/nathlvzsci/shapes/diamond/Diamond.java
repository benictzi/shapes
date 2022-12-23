package mx.com.nathlvzsci.shapes.diamond;

/**
 * 
 * @author Benjamin Natanael Ocotzi Alvarez (benictzi / nathlvzsci)
 *
 */
public class Diamond {

	/**
	 * Method that creates a diamond shape in console with the desired size, this
	 * size is evaluated if the size is even then add 1 to it, otherwise the size is
	 * returned normally this is because is the size is an even number the diamond
	 * shape will be created with the incorrect indexes.
	 * 
	 * @param size Desired size that indicates the number of colums and rows that
	 *             create the diamond.
	 */
	public static void createDiamond(final int size) {
		// 1st. Calculate the total size, we evaluate the residue using the module
		// operator, if the residue is 0 the number is even so we should sum 1 because
		// we need an uneven number, if the residue is other than 0 so we return the
		// size without any modification.
		final var finalSize = (size % 2) == 0 ? size + 1 : size;

		// 2nd. We should calculate the middle point, because in each iteration we
		// increase the number of spaces ( left -1 and right +1) taking the middle as
		// the principal point of reference.
		var middle = finalSize / 2;

		// 3rd. The purpose of the startIndex and endIndex variable is for save the
		// limits(in which indexes begin the diamond shape and ends.) at the first
		// iteration they should initialised with the middle value, because is our start
		// point for move to left and right.
		var startIndex = middle;
		var endIndex = startIndex;

		// I use the first for-statement for iterate the rows since this is a 2D
		// diamond.
		for (int rows = 0; rows < finalSize; rows++) {
			// I use a second for-statement for create the columns that contains the
			// diamond.
			for (int columns = 0; columns < finalSize; columns++) {
				// I evaluate the range, if the columns index-value is gt or eq to start index
				// but not gt endIndex then print a space that represent the diamond body :D.
				if ((columns >= startIndex) && (columns <= endIndex)) {
					System.out.print(" ");
				} else {
					// Else if the columns index-value is out of the range this mean that is only a
					// part of the frame.
					System.out.print("O");
				}

			}
			// If the rows index-value is eq or gt middle we reverse the signs, instead of
			// sum we subtract and viceversa.
			if (rows >= middle) {
				startIndex += 1;
				endIndex -= 1;
			} else {
				startIndex -= 1;
				endIndex += 1;
			}

			// a new line in each new iteration.
			System.out.println();
		}

	}


}
