
//::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
/** @author  John Miller
 *  @version 1.2
 *  @date    Fri Jun 12 15:53:24 EDT 2015
 *  @see     LICENSE (MIT style license file).
 */

package scalation.linalgebra.bld

//::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
/** The `BldAll` object calls all the builders to generate code for the vector
 *  and matrix classes/traits in the `scalation.linalgbra` package.
 *  Note, generated files have the suffix ".scalaa".
 *------------------------------------------------------------------------------
 *  vector classes        - general mathematical vectors
 *  matrix traits         - base traits for several kinds of matrices
 *  matrix classes        - regular (dense) matrices
 *  sparse matrix classes - sparse matrices (for high fraction of zeroes)
 *  symtri matrix classes - symmetric tridiagonal matrices (for eigenvalue algorithms)
 *  bid matrix classes    - square (upper) bidiagonal matrices (for SVD algorithms)
 *------------------------------------------------------------------------------
 *  To see the differences between the current code and 'new generated code',
 *  run the 'check.sh' script.
 *------------------------------------------------------------------------------
 *  To install the 'new generated code' in the package replacing the current code,
 *  run the 'install.sh' script.
 *------------------------------------------------------------------------------
 *  > run-main scalation.linalgebra.bld.BldAll
 */
object BldAll extends App
{
    BldVector.main (null)             // build vector classes
    BldMatri.main (null)              // build matrix traits
    BldMatrix.main (null)             // build matrix classes
    BldSparseMatrix.main (null)       // build sparse matrix classes
    BldSymTriMatrix.main (null)       // build symtri matrix classes
    BldBidMatrix.main (null)          // build bid matrix classes

} // BldAll object

